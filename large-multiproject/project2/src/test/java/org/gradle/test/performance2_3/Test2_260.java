package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_260 {
    private final Production2_260 production = new Production2_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}