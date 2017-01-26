package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_52 {
    private final Production43_52 production = new Production43_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}