def call(Map stageParams){

    checkout ([
        $class: 'GitSCM',
        branches: [[name: stageParams.branche ]],
        userRemoteConfigs: [[ url: stageParams.url]]
    ])

    }
