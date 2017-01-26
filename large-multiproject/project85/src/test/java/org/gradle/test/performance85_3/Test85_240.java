package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_240 {
    private final Production85_240 production = new Production85_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}