package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_372 {
    private final Production85_372 production = new Production85_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}