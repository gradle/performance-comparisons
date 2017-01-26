package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_127 {
    private final Production3_127 production = new Production3_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}