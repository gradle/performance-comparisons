package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_488 {
    private final Production39_488 production = new Production39_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}