package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_109 {
    private final Production3_109 production = new Production3_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}