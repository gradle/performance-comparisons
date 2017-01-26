package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_264 {
    private final Production77_264 production = new Production77_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}