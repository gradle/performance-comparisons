package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_249 {
    private final Production39_249 production = new Production39_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}