package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_274 {
    private final Production42_274 production = new Production42_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}