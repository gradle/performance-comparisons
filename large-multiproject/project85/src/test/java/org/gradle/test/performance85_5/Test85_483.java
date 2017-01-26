package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_483 {
    private final Production85_483 production = new Production85_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}