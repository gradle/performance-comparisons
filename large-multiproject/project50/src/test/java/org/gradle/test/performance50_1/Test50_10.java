package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_10 {
    private final Production50_10 production = new Production50_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}