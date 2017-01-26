package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_82 {
    private final Production44_82 production = new Production44_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}