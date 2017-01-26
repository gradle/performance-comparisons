package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_271 {
    private final Production2_271 production = new Production2_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}