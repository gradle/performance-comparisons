package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_274 {
    private final Production33_274 production = new Production33_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}