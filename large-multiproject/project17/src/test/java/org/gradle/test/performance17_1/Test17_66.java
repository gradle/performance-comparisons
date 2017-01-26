package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_66 {
    private final Production17_66 production = new Production17_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}