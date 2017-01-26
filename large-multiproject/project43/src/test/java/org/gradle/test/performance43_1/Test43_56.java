package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_56 {
    private final Production43_56 production = new Production43_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}