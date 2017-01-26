package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_333 {
    private final Production39_333 production = new Production39_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}