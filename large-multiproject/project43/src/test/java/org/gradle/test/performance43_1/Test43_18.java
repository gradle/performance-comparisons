package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_18 {
    private final Production43_18 production = new Production43_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}