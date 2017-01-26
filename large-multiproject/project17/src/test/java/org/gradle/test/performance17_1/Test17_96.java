package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_96 {
    private final Production17_96 production = new Production17_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}