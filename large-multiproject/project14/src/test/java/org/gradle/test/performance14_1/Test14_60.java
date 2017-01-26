package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_60 {
    private final Production14_60 production = new Production14_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}