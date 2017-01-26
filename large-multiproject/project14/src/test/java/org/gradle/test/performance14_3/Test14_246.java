package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_246 {
    private final Production14_246 production = new Production14_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}