package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_191 {
    private final Production17_191 production = new Production17_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}