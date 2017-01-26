package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_435 {
    private final Production17_435 production = new Production17_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}