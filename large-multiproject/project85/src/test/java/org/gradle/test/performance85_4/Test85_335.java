package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_335 {
    private final Production85_335 production = new Production85_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}