package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_281 {
    private final Production50_281 production = new Production50_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}