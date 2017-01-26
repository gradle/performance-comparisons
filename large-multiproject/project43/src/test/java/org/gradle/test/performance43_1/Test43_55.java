package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_55 {
    private final Production43_55 production = new Production43_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}