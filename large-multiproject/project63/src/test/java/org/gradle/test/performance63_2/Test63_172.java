package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_172 {
    private final Production63_172 production = new Production63_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}