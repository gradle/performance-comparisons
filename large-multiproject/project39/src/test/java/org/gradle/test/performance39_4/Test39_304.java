package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_304 {
    private final Production39_304 production = new Production39_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}