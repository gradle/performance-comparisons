package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_371 {
    private final Production2_371 production = new Production2_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}