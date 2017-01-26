package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_264 {
    private final Production2_264 production = new Production2_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}