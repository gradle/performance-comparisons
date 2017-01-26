package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_70 {
    private final Production2_70 production = new Production2_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}