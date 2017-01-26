package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_67 {
    private final Production14_67 production = new Production14_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}