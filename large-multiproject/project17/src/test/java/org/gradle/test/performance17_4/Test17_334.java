package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_334 {
    private final Production17_334 production = new Production17_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}