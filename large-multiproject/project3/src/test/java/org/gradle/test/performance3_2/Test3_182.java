package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_182 {
    private final Production3_182 production = new Production3_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}