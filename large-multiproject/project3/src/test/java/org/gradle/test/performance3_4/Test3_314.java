package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_314 {
    private final Production3_314 production = new Production3_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}