package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_210 {
    private final Production2_210 production = new Production2_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}