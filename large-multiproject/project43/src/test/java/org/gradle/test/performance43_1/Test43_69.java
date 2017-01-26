package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_69 {
    private final Production43_69 production = new Production43_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}