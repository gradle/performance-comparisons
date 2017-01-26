package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_28 {
    private final Production17_28 production = new Production17_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}