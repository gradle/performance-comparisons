package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_304 {
    private final Production3_304 production = new Production3_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}