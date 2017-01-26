package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_356 {
    private final Production14_356 production = new Production14_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}