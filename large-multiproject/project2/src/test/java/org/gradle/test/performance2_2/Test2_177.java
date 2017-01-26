package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_177 {
    private final Production2_177 production = new Production2_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}