package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_488 {
    private final Production2_488 production = new Production2_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}