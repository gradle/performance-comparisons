package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_184 {
    private final Production39_184 production = new Production39_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}