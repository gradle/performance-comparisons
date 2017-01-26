package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_259 {
    private final Production17_259 production = new Production17_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}