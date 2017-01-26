package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_343 {
    private final Production17_343 production = new Production17_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}