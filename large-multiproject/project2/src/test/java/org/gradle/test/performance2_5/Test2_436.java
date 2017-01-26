package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_436 {
    private final Production2_436 production = new Production2_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}