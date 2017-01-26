package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_302 {
    private final Production14_302 production = new Production14_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}