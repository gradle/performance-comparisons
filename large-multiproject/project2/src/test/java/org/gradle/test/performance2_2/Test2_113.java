package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_113 {
    private final Production2_113 production = new Production2_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}