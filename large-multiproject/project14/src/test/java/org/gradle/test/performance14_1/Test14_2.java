package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_2 {
    private final Production14_2 production = new Production14_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}