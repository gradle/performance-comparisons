package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_195 {
    private final Production63_195 production = new Production63_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}