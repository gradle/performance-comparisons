package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_345 {
    private final Production2_345 production = new Production2_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}