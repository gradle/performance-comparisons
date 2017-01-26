package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_188 {
    private final Production17_188 production = new Production17_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}