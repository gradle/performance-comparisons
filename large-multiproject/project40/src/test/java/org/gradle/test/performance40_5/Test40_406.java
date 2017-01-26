package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_406 {
    private final Production40_406 production = new Production40_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}