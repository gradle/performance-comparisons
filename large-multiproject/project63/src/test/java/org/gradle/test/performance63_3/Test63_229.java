package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_229 {
    private final Production63_229 production = new Production63_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}