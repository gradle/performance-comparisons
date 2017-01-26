package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_379 {
    private final Production2_379 production = new Production2_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}