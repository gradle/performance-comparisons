package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_81 {
    private final Production17_81 production = new Production17_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}