package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_264 {
    private final Production66_264 production = new Production66_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}