package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_195 {
    private final Production17_195 production = new Production17_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}