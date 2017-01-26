package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_391 {
    private final Production85_391 production = new Production85_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}