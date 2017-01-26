package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_20 {
    private final Production39_20 production = new Production39_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}