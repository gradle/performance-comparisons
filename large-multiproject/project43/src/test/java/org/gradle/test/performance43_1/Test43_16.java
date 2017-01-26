package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_16 {
    private final Production43_16 production = new Production43_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}