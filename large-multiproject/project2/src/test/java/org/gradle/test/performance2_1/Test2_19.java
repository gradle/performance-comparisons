package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_19 {
    private final Production2_19 production = new Production2_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}