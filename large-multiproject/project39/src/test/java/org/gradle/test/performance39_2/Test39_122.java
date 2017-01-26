package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_122 {
    private final Production39_122 production = new Production39_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}