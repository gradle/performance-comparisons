package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_12 {
    private final Production2_12 production = new Production2_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}