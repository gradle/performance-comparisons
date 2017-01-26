package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_303 {
    private final Production3_303 production = new Production3_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}