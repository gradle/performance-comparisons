package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_339 {
    private final Production39_339 production = new Production39_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}