package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_309 {
    private final Production2_309 production = new Production2_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}