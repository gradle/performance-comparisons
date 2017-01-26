package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_58 {
    private final Production63_58 production = new Production63_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}