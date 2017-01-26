package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_230 {
    private final Production3_230 production = new Production3_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}