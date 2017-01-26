package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_200 {
    private final Production63_200 production = new Production63_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}