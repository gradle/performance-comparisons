package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_109 {
    private final Production17_109 production = new Production17_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}