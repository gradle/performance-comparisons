package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_487 {
    private final Production85_487 production = new Production85_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}