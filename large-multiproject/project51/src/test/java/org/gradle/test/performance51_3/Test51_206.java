package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_206 {
    private final Production51_206 production = new Production51_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}