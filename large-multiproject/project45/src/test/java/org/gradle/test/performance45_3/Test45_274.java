package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_274 {
    private final Production45_274 production = new Production45_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}