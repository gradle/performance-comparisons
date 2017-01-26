package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_345 {
    private final Production39_345 production = new Production39_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}