package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_4 {
    private final Production50_4 production = new Production50_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}