package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_252 {
    private final Production43_252 production = new Production43_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}