package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_339 {
    private final Production2_339 production = new Production2_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}