package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_143 {
    private final Production3_143 production = new Production3_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}