package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_400 {
    private final Production2_400 production = new Production2_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}