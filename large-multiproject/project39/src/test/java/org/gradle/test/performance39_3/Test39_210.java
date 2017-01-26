package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_210 {
    private final Production39_210 production = new Production39_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}