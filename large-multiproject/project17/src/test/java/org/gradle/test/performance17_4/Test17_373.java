package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_373 {
    private final Production17_373 production = new Production17_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}