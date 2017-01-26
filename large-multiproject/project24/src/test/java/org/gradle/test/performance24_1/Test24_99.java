package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_99 {
    private final Production24_99 production = new Production24_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}