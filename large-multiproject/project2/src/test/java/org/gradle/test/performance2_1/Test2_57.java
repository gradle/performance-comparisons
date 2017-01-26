package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_57 {
    private final Production2_57 production = new Production2_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}