package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_109 {
    private final Production63_109 production = new Production63_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}