package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_222 {
    private final Production17_222 production = new Production17_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}