package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_162 {
    private final Production17_162 production = new Production17_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}