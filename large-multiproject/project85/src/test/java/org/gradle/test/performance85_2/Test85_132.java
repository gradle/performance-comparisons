package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_132 {
    private final Production85_132 production = new Production85_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}