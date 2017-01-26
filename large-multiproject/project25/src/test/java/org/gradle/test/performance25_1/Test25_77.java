package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_77 {
    private final Production25_77 production = new Production25_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}