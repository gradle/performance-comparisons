package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_220 {
    private final Production63_220 production = new Production63_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}