package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_354 {
    private final Production2_354 production = new Production2_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}