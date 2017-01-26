package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_241 {
    private final Production3_241 production = new Production3_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}