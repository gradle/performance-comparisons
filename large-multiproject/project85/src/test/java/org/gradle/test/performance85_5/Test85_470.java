package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_470 {
    private final Production85_470 production = new Production85_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}