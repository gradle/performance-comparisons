package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_69 {
    private final Production39_69 production = new Production39_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}