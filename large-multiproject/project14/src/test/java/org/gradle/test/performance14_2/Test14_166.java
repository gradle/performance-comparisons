package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_166 {
    private final Production14_166 production = new Production14_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}