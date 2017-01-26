package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_415 {
    private final Production17_415 production = new Production17_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}