package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_443 {
    private final Production51_443 production = new Production51_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}