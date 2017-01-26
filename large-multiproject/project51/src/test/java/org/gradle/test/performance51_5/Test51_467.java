package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_467 {
    private final Production51_467 production = new Production51_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}