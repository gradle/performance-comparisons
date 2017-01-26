package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_200 {
    private final Production50_200 production = new Production50_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}