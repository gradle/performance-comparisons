package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_289 {
    private final Production17_289 production = new Production17_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}