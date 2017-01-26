package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_495 {
    private final Production63_495 production = new Production63_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}