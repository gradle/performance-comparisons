package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_192 {
    private final Production39_192 production = new Production39_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}