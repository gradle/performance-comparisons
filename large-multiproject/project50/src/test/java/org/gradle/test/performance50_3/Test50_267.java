package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_267 {
    private final Production50_267 production = new Production50_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}