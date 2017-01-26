package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_381 {
    private final Production43_381 production = new Production43_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}