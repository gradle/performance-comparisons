package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_82 {
    private final Production37_82 production = new Production37_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}