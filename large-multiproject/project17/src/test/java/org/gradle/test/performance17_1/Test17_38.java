package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_38 {
    private final Production17_38 production = new Production17_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}