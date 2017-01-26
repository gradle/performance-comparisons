package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_213 {
    private final Production66_213 production = new Production66_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}