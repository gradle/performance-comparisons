package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_440 {
    private final Production39_440 production = new Production39_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}