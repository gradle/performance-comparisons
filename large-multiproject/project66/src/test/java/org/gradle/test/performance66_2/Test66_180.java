package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_180 {
    private final Production66_180 production = new Production66_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}