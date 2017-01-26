package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_82 {
    private final Production18_82 production = new Production18_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}