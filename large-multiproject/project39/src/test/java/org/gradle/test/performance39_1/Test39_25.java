package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_25 {
    private final Production39_25 production = new Production39_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}