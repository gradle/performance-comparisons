package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_471 {
    private final Production2_471 production = new Production2_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}