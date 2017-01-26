package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_429 {
    private final Production51_429 production = new Production51_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}