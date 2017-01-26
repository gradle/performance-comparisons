package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_217 {
    private final Production43_217 production = new Production43_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}