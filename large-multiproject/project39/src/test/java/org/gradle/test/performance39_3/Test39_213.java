package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_213 {
    private final Production39_213 production = new Production39_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}