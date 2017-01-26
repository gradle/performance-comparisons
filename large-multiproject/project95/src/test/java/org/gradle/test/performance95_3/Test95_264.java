package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_264 {
    private final Production95_264 production = new Production95_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}