package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_103 {
    private final Production2_103 production = new Production2_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}