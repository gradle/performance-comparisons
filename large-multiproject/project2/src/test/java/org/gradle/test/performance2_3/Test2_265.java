package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_265 {
    private final Production2_265 production = new Production2_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}