package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_114 {
    private final Production3_114 production = new Production3_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}