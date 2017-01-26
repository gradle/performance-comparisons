package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_459 {
    private final Production85_459 production = new Production85_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}