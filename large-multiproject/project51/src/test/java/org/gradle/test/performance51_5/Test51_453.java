package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_453 {
    private final Production51_453 production = new Production51_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}