package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_106 {
    private final Production14_106 production = new Production14_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}