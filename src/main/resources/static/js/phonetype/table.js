/**************************************** 初始化bootstrap-table ****************************************/
$(function() {
    // 渲染bootstrap-table
    $("#table").bootstrapTable({
        method: "post",  // 请求后台的http方式
        contentType: "application/x-www-form-urlencoded",  // 设置 post 请求 必须的！！！！
        url: "phonetype/table",  // 分页查询的url配置
        dataType : "json",  // ajax返回的内容格式
        striped: true,  // 使用表格带有条纹
        cache: false,      // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性
        pagination : true, // 是否显示分页按钮：页面选择按钮
        pageNumber: 1,  // 初始化时默认的页数
        pageSize: 5,  // 默认每页 5 条记录
        pageList: [5, 10, 20],  // 可每页 5、10、20 条记录数
        showColumns: false,     //是否显示所有的列
        showRefresh: true,     //是否显示刷新按钮
        minimumCountColumns: 2,    //最少允许的列数
        uniqueId: "id",      //每一行的唯一标识，一般为主键列
        showToggle: true, // 名片格式
        cardView: false,  // 设置为True时显示名片（card）布局
        detailView: false,     // 是否显示父子表(需要字表，设置为true)
        // index：父表当前行的行索引, row：父表当前行的Json数据对象, $detail：当前行下面创建的新行里面的td对象
        onExpandRow: function(index, row, $detail) {  // 注册加载子表的事件
        },
        singleSelect : true,  // 复选框是否单选
        search: false,  // 启用搜索
        strictSearch: true,  // 启用严格搜索
        showExport: true,  // 是否显示导出
        exportDataType: "basic",  // 导出的格式
        showColumns: true,  // 是否可选择显示的列
        clickToSelect: true,    //是否启用点击选中行
        queryParams: function(params) {//传到后台的参数
            var temp = {   // 这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的

            };
            return temp;
        }, // 指定分页参数
        queryParamsType: "limit", // 参数格式,发送标准的RESTFul类型的参数请求
        toolbar: "#toolbar", // 设置工具栏的Id或者class
        formatLoadingMessage: function () {  // 异步加载等待过程中显示的文字信息
            return "请稍等，正在加载中...";
        },
        formatNoMatches: function () {  // 没有匹配的结果
            return '无符合条件的记录';
        },
        onLoadError: function (data) {  // 加载异常时清空表格内容
            $('#table').bootstrapTable('removeAll');
        },
        checkboxHeader: false,  // 显示复选框
        sortable: false,      //是否启用排序
        sortOrder: "asc",     //排序方式
        'data-locale' : "zh-US", // 表格汉化
        responseHandler : function(res) {  // 异步请求后台成功后的回调函数，res：异步请求成功后返回的内容
            return res;
        },
        sidePagination : "server", // 服务端处理分页, 可设置: client/server 如果设置 server，必须要指定异步请求的 url 属性
        columns : [{
            checkbox: true,  // 每列增加复选框
            align : 'center',  // 居中显示
            valign : 'middle'  // 指定对其单元格的方式，可选：'top', 'middle', 'bottom'
        },
            {
                title : '机型名称',  // 表头标题
                field : 'modelId',  // 对应 返回 json 对象的属性名称
                align : 'center',  // 居中显示
                valign : 'middle'  // 指定对其单元格的方式，可选：'top', 'middle', 'bottom'
            },{
                title : '品牌Id',  // 表头标题
                field : 'brandid',  // 对应 返回 json 对象的属性名称
                align : 'center',  // 居中显示
                valign : 'middle'  // 指定对其单元格的方式，可选：'top', 'middle', 'bottom'
            },{
                title : '热门程度',  // 表头标题
                field : 'popularity',  // 对应 返回 json 对象的属性名称
                align : 'center',  // 居中显示
                valign : 'middle', // 指定对其单元格的方式，可选：'top', 'middle', 'bottom'
                formatter: function (value) {
                    if (value == 1) {
                        return "<span class='label-primary label label-default'>普通机型</span>";
                    } else if (value == 2) {
                        return "<span class='label-success label label-default'>热门机型</span>";
                    }  else if (value == 3) {
                        return "<span class='label-warning label label-default'>爆款机型</span>";
                    }
                }
            },{
                title : '上调率',  // 表头标题
                field : 'upRatio' + '%',  // 对应 返回 json 对象的属性名称
                align : 'center',  // 居中显示
                valign : 'middle'  // 指定对其单元格的方式，可选：'top', 'middle', 'bottom'
            },{
                title : '下跌率',  // 表头标题
                field : 'downRatio' + '%',  // 对应 返回 json 对象的属性名称
                align : 'center',  // 居中显示
                valign : 'middle'  // 指定对其单元格的方式，可选：'top', 'middle', 'bottom'
            },,{
                title : '发布时间',  // 表头标题
                field : 'publishTime',  // 对应 返回 json 对象的属性名称
                align : 'center',  // 居中显示
                valign : 'middle',  // 指定对其单元格的方式，可选：'top', 'middle', 'bottom'
            }]
    });
});
