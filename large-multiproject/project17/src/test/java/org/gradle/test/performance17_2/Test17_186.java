package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_186 {
    private final Production17_186 production = new Production17_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}