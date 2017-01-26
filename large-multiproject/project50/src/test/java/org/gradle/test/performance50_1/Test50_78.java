package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_78 {
    private final Production50_78 production = new Production50_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}