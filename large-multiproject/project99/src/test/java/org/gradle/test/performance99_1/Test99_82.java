package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_82 {
    private final Production99_82 production = new Production99_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}