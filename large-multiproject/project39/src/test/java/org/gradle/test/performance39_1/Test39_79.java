package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_79 {
    private final Production39_79 production = new Production39_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}