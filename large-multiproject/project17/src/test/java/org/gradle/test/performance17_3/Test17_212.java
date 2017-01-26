package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_212 {
    private final Production17_212 production = new Production17_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}