package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_142 {
    private final Production39_142 production = new Production39_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}