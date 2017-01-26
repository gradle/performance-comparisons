package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_333 {
    private final Production43_333 production = new Production43_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}