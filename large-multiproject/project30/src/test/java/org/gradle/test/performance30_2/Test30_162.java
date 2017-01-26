package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_162 {
    private final Production30_162 production = new Production30_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}