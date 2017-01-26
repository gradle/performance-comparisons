package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_131 {
    private final Production39_131 production = new Production39_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}