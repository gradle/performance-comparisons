package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_56 {
    private final Production39_56 production = new Production39_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}