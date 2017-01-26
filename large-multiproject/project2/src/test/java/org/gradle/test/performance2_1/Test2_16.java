package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_16 {
    private final Production2_16 production = new Production2_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}