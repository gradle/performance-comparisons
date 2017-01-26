package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_320 {
    private final Production43_320 production = new Production43_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}