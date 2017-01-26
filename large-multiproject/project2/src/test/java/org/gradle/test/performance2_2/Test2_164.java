package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_164 {
    private final Production2_164 production = new Production2_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}