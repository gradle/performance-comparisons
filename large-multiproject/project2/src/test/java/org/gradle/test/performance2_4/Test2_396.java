package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_396 {
    private final Production2_396 production = new Production2_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}