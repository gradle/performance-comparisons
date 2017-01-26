package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_281 {
    private final Production63_281 production = new Production63_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}