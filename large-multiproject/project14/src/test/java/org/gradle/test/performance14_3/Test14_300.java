package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_300 {
    private final Production14_300 production = new Production14_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}