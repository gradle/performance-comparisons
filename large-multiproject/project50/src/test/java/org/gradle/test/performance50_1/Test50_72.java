package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_72 {
    private final Production50_72 production = new Production50_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}