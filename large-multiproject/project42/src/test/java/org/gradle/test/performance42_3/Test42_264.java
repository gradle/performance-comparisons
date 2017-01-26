package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_264 {
    private final Production42_264 production = new Production42_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}