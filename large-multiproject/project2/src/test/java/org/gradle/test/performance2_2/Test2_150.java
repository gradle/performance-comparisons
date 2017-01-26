package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_150 {
    private final Production2_150 production = new Production2_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}