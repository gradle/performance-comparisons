package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_264 {
    private final Production19_264 production = new Production19_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}