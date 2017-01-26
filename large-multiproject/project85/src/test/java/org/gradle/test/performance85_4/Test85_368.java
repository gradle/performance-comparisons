package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_368 {
    private final Production85_368 production = new Production85_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}