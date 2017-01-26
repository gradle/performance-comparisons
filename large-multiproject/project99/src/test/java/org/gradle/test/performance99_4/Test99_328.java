package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_328 {
    private final Production99_328 production = new Production99_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}