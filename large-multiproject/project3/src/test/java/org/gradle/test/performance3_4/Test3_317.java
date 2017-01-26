package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_317 {
    private final Production3_317 production = new Production3_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}