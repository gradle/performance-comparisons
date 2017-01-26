package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_380 {
    private final Production66_380 production = new Production66_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}