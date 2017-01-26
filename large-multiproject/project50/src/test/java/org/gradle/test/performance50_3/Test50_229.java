package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_229 {
    private final Production50_229 production = new Production50_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}