package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_121 {
    private final Production2_121 production = new Production2_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}