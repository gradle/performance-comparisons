package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_156 {
    private final Production2_156 production = new Production2_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}