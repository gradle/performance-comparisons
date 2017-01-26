package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_486 {
    private final Production39_486 production = new Production39_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}