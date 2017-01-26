package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_163 {
    private final Production14_163 production = new Production14_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}