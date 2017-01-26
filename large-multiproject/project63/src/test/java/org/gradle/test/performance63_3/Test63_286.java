package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_286 {
    private final Production63_286 production = new Production63_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}