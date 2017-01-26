package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_320 {
    private final Production93_320 production = new Production93_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}