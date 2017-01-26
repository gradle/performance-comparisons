package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_307 {
    private final Production2_307 production = new Production2_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}