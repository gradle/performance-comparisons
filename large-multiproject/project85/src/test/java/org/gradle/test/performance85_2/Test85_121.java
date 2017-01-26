package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_121 {
    private final Production85_121 production = new Production85_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}