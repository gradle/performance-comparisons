package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_462 {
    private final Production43_462 production = new Production43_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}