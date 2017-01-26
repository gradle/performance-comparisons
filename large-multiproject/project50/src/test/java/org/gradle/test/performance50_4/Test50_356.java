package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_356 {
    private final Production50_356 production = new Production50_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}