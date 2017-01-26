package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_317 {
    private final Production39_317 production = new Production39_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}