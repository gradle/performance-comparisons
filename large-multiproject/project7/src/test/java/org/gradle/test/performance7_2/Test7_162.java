package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_162 {
    private final Production7_162 production = new Production7_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}