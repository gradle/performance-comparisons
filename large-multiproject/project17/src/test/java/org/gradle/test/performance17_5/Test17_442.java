package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_442 {
    private final Production17_442 production = new Production17_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}