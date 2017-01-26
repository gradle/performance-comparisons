package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_438 {
    private final Production2_438 production = new Production2_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}