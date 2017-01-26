package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_281 {
    private final Production14_281 production = new Production14_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}