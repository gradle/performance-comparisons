package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_317 {
    private final Production2_317 production = new Production2_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}