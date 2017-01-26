package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_137 {
    private final Production17_137 production = new Production17_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}