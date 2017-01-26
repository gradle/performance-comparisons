package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_97 {
    private final Production63_97 production = new Production63_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}