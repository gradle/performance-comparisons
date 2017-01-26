package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_78 {
    private final Production14_78 production = new Production14_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}