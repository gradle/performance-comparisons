package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_349 {
    private final Production2_349 production = new Production2_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}