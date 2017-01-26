package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_264 {
    private final Production81_264 production = new Production81_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}