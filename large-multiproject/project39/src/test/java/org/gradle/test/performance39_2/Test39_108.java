package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_108 {
    private final Production39_108 production = new Production39_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}