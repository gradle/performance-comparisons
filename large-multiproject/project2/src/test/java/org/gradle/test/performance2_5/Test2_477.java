package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_477 {
    private final Production2_477 production = new Production2_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}