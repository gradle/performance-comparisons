package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_139 {
    private final Production50_139 production = new Production50_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}