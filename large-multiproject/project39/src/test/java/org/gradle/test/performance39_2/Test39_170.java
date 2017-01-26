package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_170 {
    private final Production39_170 production = new Production39_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}