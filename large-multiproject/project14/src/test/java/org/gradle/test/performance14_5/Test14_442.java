package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_442 {
    private final Production14_442 production = new Production14_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}