package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_390 {
    private final Production63_390 production = new Production63_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}