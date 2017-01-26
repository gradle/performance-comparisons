package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_450 {
    private final Production14_450 production = new Production14_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}