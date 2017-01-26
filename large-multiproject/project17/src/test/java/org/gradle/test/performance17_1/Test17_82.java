package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_82 {
    private final Production17_82 production = new Production17_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}