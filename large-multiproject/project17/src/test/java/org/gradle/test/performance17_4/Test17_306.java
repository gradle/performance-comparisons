package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_306 {
    private final Production17_306 production = new Production17_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}