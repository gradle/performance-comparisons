package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_20 {
    private final Production51_20 production = new Production51_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}