package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_82 {
    private final Production74_82 production = new Production74_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}