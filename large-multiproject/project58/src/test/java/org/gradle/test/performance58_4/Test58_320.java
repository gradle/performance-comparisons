package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_320 {
    private final Production58_320 production = new Production58_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}