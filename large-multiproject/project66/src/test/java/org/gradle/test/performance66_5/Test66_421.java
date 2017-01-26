package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_421 {
    private final Production66_421 production = new Production66_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}