package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_320 {
    private final Production37_320 production = new Production37_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}