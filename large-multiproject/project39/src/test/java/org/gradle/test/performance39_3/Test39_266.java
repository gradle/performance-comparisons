package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_266 {
    private final Production39_266 production = new Production39_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}