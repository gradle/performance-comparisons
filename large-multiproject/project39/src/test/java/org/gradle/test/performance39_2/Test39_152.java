package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_152 {
    private final Production39_152 production = new Production39_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}