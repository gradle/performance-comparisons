package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_265 {
    private final Production17_265 production = new Production17_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}