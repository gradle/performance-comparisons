package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_25 {
    private final Production2_25 production = new Production2_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}