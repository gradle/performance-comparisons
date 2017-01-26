package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_150 {
    private final Production3_150 production = new Production3_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}