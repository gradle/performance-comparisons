package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_15 {
    private final Production39_15 production = new Production39_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}