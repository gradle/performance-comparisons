package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_196 {
    private final Production2_196 production = new Production2_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}