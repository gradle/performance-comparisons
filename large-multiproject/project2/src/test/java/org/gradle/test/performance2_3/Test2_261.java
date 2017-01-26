package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_261 {
    private final Production2_261 production = new Production2_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}