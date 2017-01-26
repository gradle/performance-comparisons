package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_166 {
    private final Production63_166 production = new Production63_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}