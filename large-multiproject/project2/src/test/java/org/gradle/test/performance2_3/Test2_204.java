package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_204 {
    private final Production2_204 production = new Production2_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}