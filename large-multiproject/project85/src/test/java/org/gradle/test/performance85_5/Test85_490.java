package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_490 {
    private final Production85_490 production = new Production85_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}