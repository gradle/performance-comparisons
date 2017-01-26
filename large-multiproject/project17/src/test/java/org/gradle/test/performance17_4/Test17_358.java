package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_358 {
    private final Production17_358 production = new Production17_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}