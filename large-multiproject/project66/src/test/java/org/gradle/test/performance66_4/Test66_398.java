package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_398 {
    private final Production66_398 production = new Production66_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}