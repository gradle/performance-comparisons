package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_260 {
    private final Production17_260 production = new Production17_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}