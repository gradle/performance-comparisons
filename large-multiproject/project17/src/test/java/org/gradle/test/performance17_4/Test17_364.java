package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_364 {
    private final Production17_364 production = new Production17_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}