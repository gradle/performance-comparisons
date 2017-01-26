package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_293 {
    private final Production63_293 production = new Production63_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}