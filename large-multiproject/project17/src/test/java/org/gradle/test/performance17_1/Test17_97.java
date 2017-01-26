package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_97 {
    private final Production17_97 production = new Production17_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}