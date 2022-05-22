window.addEventListener('load', function(){


    const data = {
      labels: [
        '5308',
      ],
      datasets: [{
        label: 'My First Dataset',
        data: [one],
        backgroundColor: [
          'rgb(255, 99, 132)'
        ],
        hoverOffset: 4
      }]
    };

    const dataTwo = {
        labels : [
            '5329',
        ],
        datasets: [{
            data: [two],
            backgroundColor: [
            'rgb(54, 162, 235)',
            ],
            hoverOffset: 4
        }]
    };




    const config = {
        type : 'pie',
        data : data,
    };

    const configTwo = {
        type : 'pie',
        data : dataTwo,
    };

    const chart = new Chart(
        document.getElementById('myChart'),
        config
    );

    const chartTwo = new Chart(
        document.getElementById('myChartTwo'),
        configTwo
    );
});