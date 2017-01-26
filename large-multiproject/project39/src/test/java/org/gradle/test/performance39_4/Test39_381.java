package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_381 {
    private final Production39_381 production = new Production39_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}