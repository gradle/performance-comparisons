package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_433 {
    private final Production71_433 production = new Production71_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}