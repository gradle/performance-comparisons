package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_482 {
    private final Production2_482 production = new Production2_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}