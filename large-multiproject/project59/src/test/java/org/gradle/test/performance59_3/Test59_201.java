package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_201 {
    private final Production59_201 production = new Production59_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}