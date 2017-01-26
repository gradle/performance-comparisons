package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_3 {
    private final Production14_3 production = new Production14_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}