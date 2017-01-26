package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_235 {
    private final Production39_235 production = new Production39_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}