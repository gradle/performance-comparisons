package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_154 {
    private final Production50_154 production = new Production50_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}