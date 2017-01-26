package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_291 {
    private final Production17_291 production = new Production17_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}