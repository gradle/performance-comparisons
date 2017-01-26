package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_398 {
    private final Production2_398 production = new Production2_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}