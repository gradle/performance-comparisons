package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_82 {
    private final Production89_82 production = new Production89_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}