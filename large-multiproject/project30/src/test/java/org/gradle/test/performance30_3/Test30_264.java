package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_264 {
    private final Production30_264 production = new Production30_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}