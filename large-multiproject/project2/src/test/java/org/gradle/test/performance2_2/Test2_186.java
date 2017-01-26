package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_186 {
    private final Production2_186 production = new Production2_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}