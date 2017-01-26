package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_310 {
    private final Production63_310 production = new Production63_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}