package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_401 {
    private final Production39_401 production = new Production39_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}