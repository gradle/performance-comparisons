package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_264 {
    private final Production65_264 production = new Production65_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}