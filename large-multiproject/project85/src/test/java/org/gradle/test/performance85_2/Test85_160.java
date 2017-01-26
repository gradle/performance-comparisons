package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_160 {
    private final Production85_160 production = new Production85_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}