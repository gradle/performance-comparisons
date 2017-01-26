package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_146 {
    private final Production39_146 production = new Production39_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}