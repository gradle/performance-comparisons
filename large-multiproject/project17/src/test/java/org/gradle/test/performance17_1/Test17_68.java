package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_68 {
    private final Production17_68 production = new Production17_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}