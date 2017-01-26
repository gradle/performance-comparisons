package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_75 {
    private final Production14_75 production = new Production14_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}