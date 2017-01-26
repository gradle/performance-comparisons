package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_2 {
    private final Production50_2 production = new Production50_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}