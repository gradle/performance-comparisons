package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_60 {
    private final Production39_60 production = new Production39_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}