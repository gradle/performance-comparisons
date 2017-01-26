package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_330 {
    private final Production17_330 production = new Production17_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}