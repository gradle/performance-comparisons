package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_305 {
    private final Production63_305 production = new Production63_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}