package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_71 {
    private final Production17_71 production = new Production17_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}