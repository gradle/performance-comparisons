package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_46 {
    private final Production2_46 production = new Production2_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}