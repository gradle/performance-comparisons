package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_186 {
    private final Production39_186 production = new Production39_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}