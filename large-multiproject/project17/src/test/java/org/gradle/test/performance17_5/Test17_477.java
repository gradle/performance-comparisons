package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_477 {
    private final Production17_477 production = new Production17_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}