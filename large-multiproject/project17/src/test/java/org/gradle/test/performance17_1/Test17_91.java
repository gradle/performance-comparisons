package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_91 {
    private final Production17_91 production = new Production17_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}