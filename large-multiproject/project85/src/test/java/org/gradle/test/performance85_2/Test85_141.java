package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_141 {
    private final Production85_141 production = new Production85_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}