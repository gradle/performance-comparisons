package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_334 {
    private final Production2_334 production = new Production2_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}