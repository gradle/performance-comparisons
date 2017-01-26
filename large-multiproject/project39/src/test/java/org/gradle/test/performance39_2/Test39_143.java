package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_143 {
    private final Production39_143 production = new Production39_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}