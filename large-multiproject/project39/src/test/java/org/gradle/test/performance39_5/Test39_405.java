package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_405 {
    private final Production39_405 production = new Production39_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}