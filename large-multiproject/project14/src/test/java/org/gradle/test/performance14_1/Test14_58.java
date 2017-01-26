package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_58 {
    private final Production14_58 production = new Production14_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}