package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_482 {
    private final Production39_482 production = new Production39_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}