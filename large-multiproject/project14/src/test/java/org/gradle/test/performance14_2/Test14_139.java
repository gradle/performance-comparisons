package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_139 {
    private final Production14_139 production = new Production14_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}