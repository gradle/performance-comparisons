package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_338 {
    private final Production50_338 production = new Production50_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}