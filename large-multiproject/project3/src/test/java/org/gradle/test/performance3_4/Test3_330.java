package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_330 {
    private final Production3_330 production = new Production3_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}