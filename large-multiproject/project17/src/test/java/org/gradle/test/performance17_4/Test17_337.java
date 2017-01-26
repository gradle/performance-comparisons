package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_337 {
    private final Production17_337 production = new Production17_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}