package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_220 {
    private final Production14_220 production = new Production14_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}