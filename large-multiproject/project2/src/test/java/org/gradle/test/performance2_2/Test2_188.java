package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_188 {
    private final Production2_188 production = new Production2_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}