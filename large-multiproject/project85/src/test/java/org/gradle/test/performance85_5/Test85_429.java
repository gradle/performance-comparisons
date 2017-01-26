package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_429 {
    private final Production85_429 production = new Production85_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}