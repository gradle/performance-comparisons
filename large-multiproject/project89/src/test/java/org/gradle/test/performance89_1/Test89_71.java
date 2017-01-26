package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_71 {
    private final Production89_71 production = new Production89_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}