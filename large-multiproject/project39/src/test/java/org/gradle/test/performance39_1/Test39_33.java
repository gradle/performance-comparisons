package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_33 {
    private final Production39_33 production = new Production39_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}