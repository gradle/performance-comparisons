package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_205 {
    private final Production2_205 production = new Production2_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}