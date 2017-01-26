package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_205 {
    private final Production39_205 production = new Production39_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}