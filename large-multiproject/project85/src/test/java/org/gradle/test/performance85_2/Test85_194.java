package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_194 {
    private final Production85_194 production = new Production85_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}