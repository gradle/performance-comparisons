package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_299 {
    private final Production85_299 production = new Production85_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}