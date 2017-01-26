package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_247 {
    private final Production2_247 production = new Production2_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}