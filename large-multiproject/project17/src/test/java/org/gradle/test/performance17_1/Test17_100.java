package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_100 {
    private final Production17_100 production = new Production17_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}