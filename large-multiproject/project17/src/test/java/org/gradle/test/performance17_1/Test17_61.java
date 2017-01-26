package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_61 {
    private final Production17_61 production = new Production17_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}