package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_209 {
    private final Production14_209 production = new Production14_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}