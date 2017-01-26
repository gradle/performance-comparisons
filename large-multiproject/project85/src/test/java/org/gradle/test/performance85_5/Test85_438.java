package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_438 {
    private final Production85_438 production = new Production85_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}