package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_78 {
    private final Production63_78 production = new Production63_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}