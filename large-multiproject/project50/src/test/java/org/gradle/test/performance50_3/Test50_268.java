package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_268 {
    private final Production50_268 production = new Production50_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}