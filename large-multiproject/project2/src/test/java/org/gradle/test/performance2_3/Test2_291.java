package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_291 {
    private final Production2_291 production = new Production2_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}