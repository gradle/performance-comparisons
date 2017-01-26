package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_395 {
    private final Production39_395 production = new Production39_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}