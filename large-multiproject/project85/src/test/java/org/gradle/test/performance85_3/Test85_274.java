package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_274 {
    private final Production85_274 production = new Production85_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}