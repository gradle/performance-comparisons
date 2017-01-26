package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_95 {
    private final Production43_95 production = new Production43_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}