package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_364 {
    private final Production2_364 production = new Production2_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}