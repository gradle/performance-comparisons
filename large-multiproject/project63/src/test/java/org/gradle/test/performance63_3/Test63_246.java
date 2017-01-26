package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_246 {
    private final Production63_246 production = new Production63_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}