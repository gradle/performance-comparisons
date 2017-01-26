package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_235 {
    private final Production2_235 production = new Production2_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}