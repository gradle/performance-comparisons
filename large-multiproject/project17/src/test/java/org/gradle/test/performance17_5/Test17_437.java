package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_437 {
    private final Production17_437 production = new Production17_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}