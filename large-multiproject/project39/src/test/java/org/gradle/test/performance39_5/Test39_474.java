package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_474 {
    private final Production39_474 production = new Production39_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}