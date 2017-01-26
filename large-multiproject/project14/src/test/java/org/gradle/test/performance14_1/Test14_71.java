package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_71 {
    private final Production14_71 production = new Production14_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}