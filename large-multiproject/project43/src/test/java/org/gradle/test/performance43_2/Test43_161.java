package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_161 {
    private final Production43_161 production = new Production43_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}