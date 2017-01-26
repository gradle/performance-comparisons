package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_441 {
    private final Production39_441 production = new Production39_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}