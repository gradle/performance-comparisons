package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_67 {
    private final Production17_67 production = new Production17_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}