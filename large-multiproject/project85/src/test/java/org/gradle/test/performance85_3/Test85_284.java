package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_284 {
    private final Production85_284 production = new Production85_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}