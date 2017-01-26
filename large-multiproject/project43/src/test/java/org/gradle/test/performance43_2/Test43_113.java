package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_113 {
    private final Production43_113 production = new Production43_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}