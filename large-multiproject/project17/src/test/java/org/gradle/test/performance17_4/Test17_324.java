package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_324 {
    private final Production17_324 production = new Production17_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}