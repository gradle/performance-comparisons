package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_466 {
    private final Production17_466 production = new Production17_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}