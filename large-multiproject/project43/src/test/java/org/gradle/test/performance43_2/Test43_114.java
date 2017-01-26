package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_114 {
    private final Production43_114 production = new Production43_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}