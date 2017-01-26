package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_113 {
    private final Production39_113 production = new Production39_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}