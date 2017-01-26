package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_202 {
    private final Production63_202 production = new Production63_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}