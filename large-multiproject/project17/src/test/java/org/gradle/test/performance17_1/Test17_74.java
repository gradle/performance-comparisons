package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_74 {
    private final Production17_74 production = new Production17_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}