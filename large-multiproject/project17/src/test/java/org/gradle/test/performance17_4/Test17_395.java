package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_395 {
    private final Production17_395 production = new Production17_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}