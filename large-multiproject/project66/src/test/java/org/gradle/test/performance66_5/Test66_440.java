package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_440 {
    private final Production66_440 production = new Production66_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}