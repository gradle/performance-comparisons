package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_264 {
    private final Production9_264 production = new Production9_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}