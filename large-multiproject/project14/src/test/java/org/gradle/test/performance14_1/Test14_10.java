package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_10 {
    private final Production14_10 production = new Production14_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}