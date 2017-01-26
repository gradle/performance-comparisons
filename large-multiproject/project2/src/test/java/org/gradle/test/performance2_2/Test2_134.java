package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_134 {
    private final Production2_134 production = new Production2_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}