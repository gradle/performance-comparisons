package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_127 {
    private final Production2_127 production = new Production2_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}