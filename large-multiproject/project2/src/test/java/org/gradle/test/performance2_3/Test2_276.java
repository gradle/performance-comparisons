package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_276 {
    private final Production2_276 production = new Production2_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}