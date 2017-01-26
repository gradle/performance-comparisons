package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_265 {
    private final Production39_265 production = new Production39_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}