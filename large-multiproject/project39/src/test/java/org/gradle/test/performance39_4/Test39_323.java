package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_323 {
    private final Production39_323 production = new Production39_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}