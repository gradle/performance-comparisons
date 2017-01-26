package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_280 {
    private final Production99_280 production = new Production99_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}