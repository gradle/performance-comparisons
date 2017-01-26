package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_337 {
    private final Production63_337 production = new Production63_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}