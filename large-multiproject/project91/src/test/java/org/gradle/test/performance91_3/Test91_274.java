package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_274 {
    private final Production91_274 production = new Production91_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}