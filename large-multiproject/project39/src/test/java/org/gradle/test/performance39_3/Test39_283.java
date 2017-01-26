package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_283 {
    private final Production39_283 production = new Production39_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}