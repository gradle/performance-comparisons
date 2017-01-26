package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_484 {
    private final Production39_484 production = new Production39_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}