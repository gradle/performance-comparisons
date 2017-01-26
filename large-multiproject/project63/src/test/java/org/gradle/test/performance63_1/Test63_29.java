package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_29 {
    private final Production63_29 production = new Production63_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}