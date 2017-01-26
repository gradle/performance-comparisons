package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_435 {
    private final Production39_435 production = new Production39_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}