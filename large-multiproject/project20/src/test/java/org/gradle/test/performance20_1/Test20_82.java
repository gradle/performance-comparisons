package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_82 {
    private final Production20_82 production = new Production20_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}