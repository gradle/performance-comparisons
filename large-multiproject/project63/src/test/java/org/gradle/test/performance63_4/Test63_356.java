package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_356 {
    private final Production63_356 production = new Production63_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}