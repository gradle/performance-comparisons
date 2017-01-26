package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_180 {
    private final Production39_180 production = new Production39_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}