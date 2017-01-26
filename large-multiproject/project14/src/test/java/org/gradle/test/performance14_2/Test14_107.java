package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_107 {
    private final Production14_107 production = new Production14_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}