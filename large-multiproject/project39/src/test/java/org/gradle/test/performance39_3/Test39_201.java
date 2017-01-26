package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_201 {
    private final Production39_201 production = new Production39_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}