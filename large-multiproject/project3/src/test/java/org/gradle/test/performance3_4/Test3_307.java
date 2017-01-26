package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_307 {
    private final Production3_307 production = new Production3_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}