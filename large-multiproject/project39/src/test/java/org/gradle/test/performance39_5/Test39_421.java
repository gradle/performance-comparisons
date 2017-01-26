package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_421 {
    private final Production39_421 production = new Production39_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}