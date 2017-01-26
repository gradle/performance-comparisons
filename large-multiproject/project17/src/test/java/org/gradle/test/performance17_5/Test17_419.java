package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_419 {
    private final Production17_419 production = new Production17_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}