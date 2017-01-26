package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_99 {
    private final Production49_99 production = new Production49_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}