package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_82 {
    private final Production29_82 production = new Production29_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}