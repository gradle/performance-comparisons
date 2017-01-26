package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_60 {
    private final Production17_60 production = new Production17_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}