package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_395 {
    private final Production50_395 production = new Production50_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}