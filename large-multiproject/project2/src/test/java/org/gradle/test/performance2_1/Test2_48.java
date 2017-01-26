package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_48 {
    private final Production2_48 production = new Production2_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}