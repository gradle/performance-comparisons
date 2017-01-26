package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_99 {
    private final Production2_99 production = new Production2_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}