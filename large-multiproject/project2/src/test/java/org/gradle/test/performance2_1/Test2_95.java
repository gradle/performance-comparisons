package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_95 {
    private final Production2_95 production = new Production2_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}