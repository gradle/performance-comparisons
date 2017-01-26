package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_443 {
    private final Production85_443 production = new Production85_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}