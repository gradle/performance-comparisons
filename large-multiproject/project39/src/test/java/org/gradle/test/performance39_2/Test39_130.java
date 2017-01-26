package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_130 {
    private final Production39_130 production = new Production39_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}