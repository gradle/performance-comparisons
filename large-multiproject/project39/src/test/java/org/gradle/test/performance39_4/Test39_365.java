package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_365 {
    private final Production39_365 production = new Production39_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}