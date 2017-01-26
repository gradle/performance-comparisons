package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_424 {
    private final Production39_424 production = new Production39_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}