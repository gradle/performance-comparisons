package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_382 {
    private final Production17_382 production = new Production17_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}