package com.example.e_mirim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

interface RulesListInfo {}
data class RuleInfo(val ruleContent: String) : RulesListInfo
data class DividerInfo(val text: String) : RulesListInfo

class RulesAdapter(val infos: List<RulesListInfo>)
    : RecyclerView.Adapter<RulesAdapter.ViewHolder>(){

    class ViewHolder(val view: View)
        :RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // val schedule = schedulelist[position]
        // holder.view.findViewById<TextView>(R.id.schedule_desc).text = schedule.job
        val info = infos[position]
        if(info is RuleInfo) {
            holder.view.findViewById<TextView>(R.id.rule_info).text = info.ruleContent
        } else {
            holder.view.findViewById<TextView>(R.id.divider_text).text = (info as DividerInfo).text
        }
    }

    override fun getItemCount(): Int {
        return infos.size
    }

    override fun getItemViewType(position: Int): Int {
        if(infos[position] is RuleInfo) {
            return R.layout.rule_info
        }  else {
            return R.layout.divider_info
        }
    }
}

class MirimRulesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.school_rules_fragment, container, false)

        val rulesList = view.findViewById<RecyclerView>(R.id.rules_list)
        rulesList.setHasFixedSize(true)
        val rulesListInfo = listOf<RulesListInfo>(
            DividerInfo("생활"),
            RuleInfo("8시 20분까지 등교하기"),
            RuleInfo("술, 담배하지 않기"),
            RuleInfo("교실 의자 책상에 올리기"),
            RuleInfo("핸드폰 제출하기"),
            RuleInfo("월, 금 아침 주번조희"),
            RuleInfo("교실 문 단속하기"),
            RuleInfo("실습실 컴퓨터 전원 잘 끄기"),
            RuleInfo("실습실에서 음식물 섭취하지 않기"),
            RuleInfo("엘리베이터 타지 않기"),
            RuleInfo("교무실에서는 조용히하기"),
            RuleInfo("실습실 사용 후 정리정돈 잘 하기"),
            RuleInfo("PC, 핸드폰 아이피 본인 아이피 사용하기"),
            DividerInfo("복장"),
            RuleInfo("춘추복 위에 사복 입지않기"),
            RuleInfo("귀에 딱 붙는 귀걸이"),
            RuleInfo("교복 치마 길이 무릎에 맞추기"),
            RuleInfo("체육시간 전 후 시간 외에는 체육복 입지 않기"),
            RuleInfo("발목까지 오는 신발 착용 금지"),
            RuleInfo("하복 위에 사복 입지 않기"),
            RuleInfo("하복 입을 때 속옷이 비치지 않도록 하기"),
            RuleInfo("사복 입지 않기"),
            RuleInfo("실내화 신고 다니기"),
            RuleInfo("실내화에 지비츠 달지 않기"),
            RuleInfo("책가방만 가능"),
            RuleInfo("학생 신분에 맞지않는 신발 신지 않기"),
            DividerInfo("상점"),
            RuleInfo("교과우수상"),
            RuleInfo("교내봉사"),
            DividerInfo("기숙사"),
            RuleInfo("6시부터 공동구역 사용가능"),
            RuleInfo("정해진 시간에 정해진 세탁기 사용"),
            RuleInfo("타호실 출입금지"),
            RuleInfo("유제품 외에 음식물 반입금지"),
            RuleInfo("아침 7시에 점호"),
            RuleInfo("평일 저녁 9시 30분, 주말 저녁 9시 점호"),
            RuleInfo("밤 11시 호실 소등"),
            RuleInfo("밤 10시 30분 공동구역 소등"),
            RuleInfo("슬리퍼 신고 다니기"),
            RuleInfo("밖에 나갈 때는 반드시 교복과 체육복 중 착용하기"),
        )
        val adaptor = RulesAdapter(rulesListInfo)
        rulesList.layoutManager = LinearLayoutManager(requireContext())
        rulesList.adapter = adaptor

        return view
    }
}