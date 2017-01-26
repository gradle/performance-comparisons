package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_438 {
    private final Production51_438 production = new Production51_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}