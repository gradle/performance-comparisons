package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_389 {
    private final Production99_389 production = new Production99_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}