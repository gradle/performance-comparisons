package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_392 {
    private final Production50_392 production = new Production50_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}