package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_359 {
    private final Production85_359 production = new Production85_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}