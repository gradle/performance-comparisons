package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_29 {
    private final Production17_29 production = new Production17_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}