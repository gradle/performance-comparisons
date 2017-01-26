package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_172 {
    private final Production14_172 production = new Production14_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}