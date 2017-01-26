package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_99 {
    private final Production63_99 production = new Production63_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}