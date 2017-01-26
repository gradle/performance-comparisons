package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_201 {
    private final Production91_201 production = new Production91_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}