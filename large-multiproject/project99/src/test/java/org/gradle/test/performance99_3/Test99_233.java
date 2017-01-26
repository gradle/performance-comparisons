package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_233 {
    private final Production99_233 production = new Production99_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}