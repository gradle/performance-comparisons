package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_314 {
    private final Production8_314 production = new Production8_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}