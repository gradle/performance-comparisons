package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_249 {
    private final Production17_249 production = new Production17_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}