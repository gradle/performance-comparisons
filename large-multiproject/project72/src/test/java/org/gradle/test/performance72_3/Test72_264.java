package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_264 {
    private final Production72_264 production = new Production72_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}