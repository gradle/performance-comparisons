package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_264 {
    private final Production79_264 production = new Production79_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}