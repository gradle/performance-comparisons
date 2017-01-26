package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_274 {
    private final Production59_274 production = new Production59_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}