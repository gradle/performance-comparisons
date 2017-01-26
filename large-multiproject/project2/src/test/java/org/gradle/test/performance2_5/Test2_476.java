package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_476 {
    private final Production2_476 production = new Production2_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}