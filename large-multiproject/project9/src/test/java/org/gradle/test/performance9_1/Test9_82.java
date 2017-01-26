package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_82 {
    private final Production9_82 production = new Production9_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}