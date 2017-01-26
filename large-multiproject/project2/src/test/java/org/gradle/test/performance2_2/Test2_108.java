package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_108 {
    private final Production2_108 production = new Production2_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}