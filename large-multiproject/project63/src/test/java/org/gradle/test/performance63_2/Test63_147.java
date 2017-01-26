package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_147 {
    private final Production63_147 production = new Production63_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}