package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_62 {
    private final Production63_62 production = new Production63_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}