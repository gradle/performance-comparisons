package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_41 {
    private final Production17_41 production = new Production17_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}