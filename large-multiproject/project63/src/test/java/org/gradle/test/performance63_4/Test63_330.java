package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_330 {
    private final Production63_330 production = new Production63_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}