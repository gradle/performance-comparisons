package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_264 {
    private final Production29_264 production = new Production29_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}