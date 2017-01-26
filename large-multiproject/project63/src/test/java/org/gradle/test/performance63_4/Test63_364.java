package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_364 {
    private final Production63_364 production = new Production63_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}