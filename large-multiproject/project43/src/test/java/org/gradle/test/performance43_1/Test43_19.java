package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_19 {
    private final Production43_19 production = new Production43_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}