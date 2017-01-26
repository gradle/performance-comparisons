package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_462 {
    private final Production2_462 production = new Production2_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}