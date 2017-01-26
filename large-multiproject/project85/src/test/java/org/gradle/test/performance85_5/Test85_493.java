package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_493 {
    private final Production85_493 production = new Production85_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}