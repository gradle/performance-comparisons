package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_320 {
    private final Production10_320 production = new Production10_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}