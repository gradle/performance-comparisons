package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_254 {
    private final Production39_254 production = new Production39_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}