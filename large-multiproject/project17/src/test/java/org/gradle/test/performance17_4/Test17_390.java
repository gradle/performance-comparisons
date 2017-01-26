package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_390 {
    private final Production17_390 production = new Production17_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}