package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_399 {
    private final Production51_399 production = new Production51_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}