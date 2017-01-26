package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_74 {
    private final Production30_74 production = new Production30_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}