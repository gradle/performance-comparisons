package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_486 {
    private final Production51_486 production = new Production51_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}