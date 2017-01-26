package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_217 {
    private final Production2_217 production = new Production2_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}