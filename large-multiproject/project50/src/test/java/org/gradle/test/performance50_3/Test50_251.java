package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_251 {
    private final Production50_251 production = new Production50_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}