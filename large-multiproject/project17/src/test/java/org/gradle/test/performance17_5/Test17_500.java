package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_500 {
    private final Production17_500 production = new Production17_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}