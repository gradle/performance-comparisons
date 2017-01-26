package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_483 {
    private final Production51_483 production = new Production51_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}