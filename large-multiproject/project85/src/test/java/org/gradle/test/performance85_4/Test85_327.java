package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_327 {
    private final Production85_327 production = new Production85_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}