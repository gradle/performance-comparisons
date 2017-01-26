package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_116 {
    private final Production2_116 production = new Production2_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}