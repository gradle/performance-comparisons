package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_55 {
    private final Production39_55 production = new Production39_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}