package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_171 {
    private final Production2_171 production = new Production2_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}