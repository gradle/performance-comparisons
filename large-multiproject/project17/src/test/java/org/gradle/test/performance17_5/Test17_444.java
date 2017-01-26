package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_444 {
    private final Production17_444 production = new Production17_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}