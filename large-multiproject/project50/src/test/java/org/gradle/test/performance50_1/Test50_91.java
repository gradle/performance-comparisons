package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_91 {
    private final Production50_91 production = new Production50_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}