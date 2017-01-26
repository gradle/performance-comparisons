package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_365 {
    private final Production2_365 production = new Production2_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}