package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_264 {
    private final Production39_264 production = new Production39_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}