package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_395 {
    private final Production66_395 production = new Production66_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}