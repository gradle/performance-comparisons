package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_35 {
    private final Production2_35 production = new Production2_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}