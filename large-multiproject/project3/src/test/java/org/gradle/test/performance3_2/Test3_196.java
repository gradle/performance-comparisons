package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_196 {
    private final Production3_196 production = new Production3_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}