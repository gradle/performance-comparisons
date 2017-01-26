package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_253 {
    private final Production3_253 production = new Production3_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}