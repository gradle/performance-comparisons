package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_127 {
    private final Production39_127 production = new Production39_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}