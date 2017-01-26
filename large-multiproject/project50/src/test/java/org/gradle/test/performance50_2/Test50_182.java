package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_182 {
    private final Production50_182 production = new Production50_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}