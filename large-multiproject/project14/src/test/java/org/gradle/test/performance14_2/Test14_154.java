package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_154 {
    private final Production14_154 production = new Production14_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}