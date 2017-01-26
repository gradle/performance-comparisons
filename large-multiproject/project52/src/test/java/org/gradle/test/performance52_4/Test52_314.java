package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_314 {
    private final Production52_314 production = new Production52_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}