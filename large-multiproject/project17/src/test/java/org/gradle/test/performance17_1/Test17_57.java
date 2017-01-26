package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_57 {
    private final Production17_57 production = new Production17_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}