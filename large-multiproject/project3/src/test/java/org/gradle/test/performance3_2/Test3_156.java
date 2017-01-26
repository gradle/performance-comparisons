package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_156 {
    private final Production3_156 production = new Production3_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}