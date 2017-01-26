package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_444 {
    private final Production63_444 production = new Production63_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}