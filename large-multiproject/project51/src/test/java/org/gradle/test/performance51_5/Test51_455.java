package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_455 {
    private final Production51_455 production = new Production51_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}