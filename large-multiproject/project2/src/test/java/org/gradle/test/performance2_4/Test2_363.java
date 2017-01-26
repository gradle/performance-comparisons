package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_363 {
    private final Production2_363 production = new Production2_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}