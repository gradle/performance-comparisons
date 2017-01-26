package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_70 {
    private final Production39_70 production = new Production39_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}