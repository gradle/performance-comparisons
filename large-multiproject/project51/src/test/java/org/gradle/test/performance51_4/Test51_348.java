package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_348 {
    private final Production51_348 production = new Production51_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}