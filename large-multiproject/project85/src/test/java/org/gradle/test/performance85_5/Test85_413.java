package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_413 {
    private final Production85_413 production = new Production85_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}