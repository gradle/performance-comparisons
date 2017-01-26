package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_107 {
    private final Production63_107 production = new Production63_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}