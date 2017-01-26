package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_320 {
    private final Production7_320 production = new Production7_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}