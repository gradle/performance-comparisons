package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_322 {
    private final Production3_322 production = new Production3_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}