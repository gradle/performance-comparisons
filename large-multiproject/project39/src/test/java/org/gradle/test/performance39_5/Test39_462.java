package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_462 {
    private final Production39_462 production = new Production39_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}