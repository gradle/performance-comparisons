package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_64 {
    private final Production2_64 production = new Production2_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}