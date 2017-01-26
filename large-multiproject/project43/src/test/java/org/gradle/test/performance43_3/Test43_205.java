package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_205 {
    private final Production43_205 production = new Production43_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}