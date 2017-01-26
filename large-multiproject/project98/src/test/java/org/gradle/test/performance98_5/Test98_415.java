package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_415 {
    private final Production98_415 production = new Production98_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}