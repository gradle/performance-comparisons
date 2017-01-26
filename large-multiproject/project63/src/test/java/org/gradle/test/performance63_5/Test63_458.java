package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_458 {
    private final Production63_458 production = new Production63_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}