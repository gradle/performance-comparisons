package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_264 {
    private final Production74_264 production = new Production74_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}