package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_81 {
    private final Production2_81 production = new Production2_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}