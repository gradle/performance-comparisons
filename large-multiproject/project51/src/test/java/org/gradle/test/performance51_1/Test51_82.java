package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_82 {
    private final Production51_82 production = new Production51_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}