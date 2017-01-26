package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_270 {
    private final Production2_270 production = new Production2_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}