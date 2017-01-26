package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_320 {
    private final Production3_320 production = new Production3_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}