package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_14 {
    private final Production50_14 production = new Production50_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}