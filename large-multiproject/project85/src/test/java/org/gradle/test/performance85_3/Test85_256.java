package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_256 {
    private final Production85_256 production = new Production85_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}