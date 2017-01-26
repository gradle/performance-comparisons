package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_274 {
    private final Production81_274 production = new Production81_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}