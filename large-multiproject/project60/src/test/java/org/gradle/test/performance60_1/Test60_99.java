package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_99 {
    private final Production60_99 production = new Production60_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}