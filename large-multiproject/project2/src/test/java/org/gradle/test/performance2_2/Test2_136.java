package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_136 {
    private final Production2_136 production = new Production2_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}