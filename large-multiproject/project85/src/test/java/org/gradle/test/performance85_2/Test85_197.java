package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_197 {
    private final Production85_197 production = new Production85_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}