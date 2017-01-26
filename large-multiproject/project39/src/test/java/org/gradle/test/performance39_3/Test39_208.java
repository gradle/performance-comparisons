package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_208 {
    private final Production39_208 production = new Production39_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}