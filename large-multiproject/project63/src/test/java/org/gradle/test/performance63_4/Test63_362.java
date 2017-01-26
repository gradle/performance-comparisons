package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_362 {
    private final Production63_362 production = new Production63_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}