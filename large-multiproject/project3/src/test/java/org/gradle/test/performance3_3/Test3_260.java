package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_260 {
    private final Production3_260 production = new Production3_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}