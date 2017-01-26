package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_482 {
    private final Production43_482 production = new Production43_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}