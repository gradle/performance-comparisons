package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_16 {
    private final Production39_16 production = new Production39_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}