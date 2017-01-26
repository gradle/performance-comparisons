package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_184 {
    private final Production85_184 production = new Production85_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}