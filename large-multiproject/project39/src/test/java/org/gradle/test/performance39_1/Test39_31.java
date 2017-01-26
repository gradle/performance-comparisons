package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_31 {
    private final Production39_31 production = new Production39_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}