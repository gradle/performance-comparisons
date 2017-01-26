package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_302 {
    private final Production2_302 production = new Production2_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}