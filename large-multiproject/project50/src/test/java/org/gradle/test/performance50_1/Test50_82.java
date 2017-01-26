package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_82 {
    private final Production50_82 production = new Production50_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}