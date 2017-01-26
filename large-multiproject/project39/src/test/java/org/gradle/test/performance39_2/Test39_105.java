package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_105 {
    private final Production39_105 production = new Production39_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}