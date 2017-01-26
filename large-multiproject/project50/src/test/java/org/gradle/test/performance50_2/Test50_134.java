package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_134 {
    private final Production50_134 production = new Production50_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}