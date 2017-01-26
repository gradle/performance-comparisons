package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_409 {
    private final Production85_409 production = new Production85_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}