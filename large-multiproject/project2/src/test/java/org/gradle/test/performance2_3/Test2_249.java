package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_249 {
    private final Production2_249 production = new Production2_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}