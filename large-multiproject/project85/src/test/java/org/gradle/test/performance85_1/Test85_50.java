package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_50 {
    private final Production85_50 production = new Production85_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}