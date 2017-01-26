package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_247 {
    private final Production39_247 production = new Production39_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}