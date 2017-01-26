package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_290 {
    private final Production2_290 production = new Production2_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}