package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_476 {
    private final Production39_476 production = new Production39_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}