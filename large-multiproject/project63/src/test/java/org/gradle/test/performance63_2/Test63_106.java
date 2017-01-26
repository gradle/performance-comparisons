package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_106 {
    private final Production63_106 production = new Production63_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}