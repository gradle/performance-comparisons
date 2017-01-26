package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_297 {
    private final Production63_297 production = new Production63_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}