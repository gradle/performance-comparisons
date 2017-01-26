package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_313 {
    private final Production50_313 production = new Production50_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}