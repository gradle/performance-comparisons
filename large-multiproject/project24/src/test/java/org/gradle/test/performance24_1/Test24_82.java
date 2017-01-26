package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_82 {
    private final Production24_82 production = new Production24_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}