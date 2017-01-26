package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_63 {
    private final Production43_63 production = new Production43_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}