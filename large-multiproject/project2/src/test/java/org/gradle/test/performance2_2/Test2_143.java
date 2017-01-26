package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_143 {
    private final Production2_143 production = new Production2_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}