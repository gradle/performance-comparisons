package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_465 {
    private final Production63_465 production = new Production63_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}