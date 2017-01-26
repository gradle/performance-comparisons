package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_293 {
    private final Production30_293 production = new Production30_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}