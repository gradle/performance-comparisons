package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_283 {
    private final Production2_283 production = new Production2_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}