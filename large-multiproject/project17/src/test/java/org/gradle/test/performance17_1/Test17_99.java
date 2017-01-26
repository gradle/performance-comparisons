package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_99 {
    private final Production17_99 production = new Production17_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}