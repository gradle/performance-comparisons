package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_332 {
    private final Production85_332 production = new Production85_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}