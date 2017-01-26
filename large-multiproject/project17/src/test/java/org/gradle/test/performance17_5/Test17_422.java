package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_422 {
    private final Production17_422 production = new Production17_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}