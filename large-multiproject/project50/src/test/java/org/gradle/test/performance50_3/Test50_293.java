package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_293 {
    private final Production50_293 production = new Production50_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}