package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_8 {
    private final Production14_8 production = new Production14_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}