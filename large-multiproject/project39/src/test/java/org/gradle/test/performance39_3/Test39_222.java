package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_222 {
    private final Production39_222 production = new Production39_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}