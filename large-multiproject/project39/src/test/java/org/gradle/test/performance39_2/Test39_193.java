package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_193 {
    private final Production39_193 production = new Production39_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}