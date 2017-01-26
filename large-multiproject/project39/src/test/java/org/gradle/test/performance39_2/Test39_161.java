package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_161 {
    private final Production39_161 production = new Production39_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}