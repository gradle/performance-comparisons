package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_259 {
    private final Production14_259 production = new Production14_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}