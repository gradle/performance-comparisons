package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_320 {
    private final Production4_320 production = new Production4_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}