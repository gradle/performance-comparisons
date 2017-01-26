package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_264 {
    private final Production34_264 production = new Production34_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}