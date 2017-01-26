package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_83 {
    private final Production2_83 production = new Production2_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}