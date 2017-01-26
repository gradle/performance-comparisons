package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_430 {
    private final Production68_430 production = new Production68_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}