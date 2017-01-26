package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_376 {
    private final Production85_376 production = new Production85_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}