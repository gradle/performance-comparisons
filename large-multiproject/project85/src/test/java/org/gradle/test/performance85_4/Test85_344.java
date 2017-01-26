package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_344 {
    private final Production85_344 production = new Production85_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}