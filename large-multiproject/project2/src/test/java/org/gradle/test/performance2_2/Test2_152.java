package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_152 {
    private final Production2_152 production = new Production2_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}