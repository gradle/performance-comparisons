package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_244 {
    private final Production39_244 production = new Production39_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}