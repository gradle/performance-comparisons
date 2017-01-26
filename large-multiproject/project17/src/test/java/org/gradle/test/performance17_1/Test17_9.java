package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_9 {
    private final Production17_9 production = new Production17_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}