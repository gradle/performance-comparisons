package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_175 {
    private final Production2_175 production = new Production2_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}