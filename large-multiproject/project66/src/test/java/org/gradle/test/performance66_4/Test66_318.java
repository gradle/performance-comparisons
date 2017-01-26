package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_318 {
    private final Production66_318 production = new Production66_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}