package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_264 {
    private final Production10_264 production = new Production10_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}