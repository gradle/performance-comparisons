package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_399 {
    private final Production85_399 production = new Production85_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}