package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_469 {
    private final Production2_469 production = new Production2_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}