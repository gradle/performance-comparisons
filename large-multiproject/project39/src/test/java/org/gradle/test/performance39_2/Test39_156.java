package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_156 {
    private final Production39_156 production = new Production39_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}