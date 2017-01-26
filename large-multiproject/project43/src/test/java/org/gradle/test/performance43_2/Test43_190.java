package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_190 {
    private final Production43_190 production = new Production43_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}