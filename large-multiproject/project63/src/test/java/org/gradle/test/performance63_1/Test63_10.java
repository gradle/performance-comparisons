package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_10 {
    private final Production63_10 production = new Production63_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}