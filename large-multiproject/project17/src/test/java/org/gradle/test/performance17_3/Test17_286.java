package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_286 {
    private final Production17_286 production = new Production17_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}