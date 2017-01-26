package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_65 {
    private final Production43_65 production = new Production43_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}