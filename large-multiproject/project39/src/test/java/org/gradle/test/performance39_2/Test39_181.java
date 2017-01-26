package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_181 {
    private final Production39_181 production = new Production39_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}