package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_235 {
    private final Production17_235 production = new Production17_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}