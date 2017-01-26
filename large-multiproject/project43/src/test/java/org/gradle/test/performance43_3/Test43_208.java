package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_208 {
    private final Production43_208 production = new Production43_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}