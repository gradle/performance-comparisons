package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_290 {
    private final Production39_290 production = new Production39_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}