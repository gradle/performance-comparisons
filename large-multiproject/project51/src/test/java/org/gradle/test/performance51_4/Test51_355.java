package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_355 {
    private final Production51_355 production = new Production51_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}