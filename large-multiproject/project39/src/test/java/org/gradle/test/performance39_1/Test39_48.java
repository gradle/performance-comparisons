package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_48 {
    private final Production39_48 production = new Production39_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}