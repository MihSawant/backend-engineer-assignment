window.addEventListener('load', function(){

    console.log(time, vol);

    const labels = [time];

    const data = {
        labels: labels,
        datasets: [{
            label: 'Voltage Vs Time',
            data: [vol],
            fill: false,
            borderColor: 'blue',
            tension: 0.1
        }]

    };

    const currData = {
        labels : [time],
        datasets: [{
            label: 'Current Vs Time',
            data: [curr],
            fill: false,
            borderColor: 'yellow',
            tension: 0.9
        }]

    };

    const capData = {
            labels : [time],
            datasets: [{
                label: 'Capacity Vs Time',
                data: [cap],
                fill: false,
                borderColor: 'violet',
                tension: 0.9
            }]

        };

        const tempData = {
                labels : [time],
                datasets: [{
                    label: 'Temprature Vs Time',
                    data: [temp],
                    fill: false,
                    borderColor: 'cyan',
                    tension: 0.9
                }]

            };


    const voltageConfig = {
        type : 'line',
        data : data,
    };

    const currentConfig = {
        type : 'line',
        data: currData,
    };

    const tempConfig = {
            type : 'line',
            data: tempData,
        };
        const capConfig = {
                type : 'line',
                data: capData,
            };

    const volChart = new Chart(
        document.getElementById('volVsTime'),
        voltageConfig
    );

    const currChart = new Chart(
        document.getElementById('currVsTime'),
        currentConfig
    );

    const tempChart = new Chart(
        document.getElementById('tempVsTime'),
        tempConfig
    );

    const capChart = new Chart(
        document.getElementById('capVsTime'),
        capConfig
    );

});