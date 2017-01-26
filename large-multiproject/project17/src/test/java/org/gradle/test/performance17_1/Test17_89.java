package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_89 {
    private final Production17_89 production = new Production17_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}