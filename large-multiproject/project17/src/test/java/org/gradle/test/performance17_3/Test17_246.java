package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_246 {
    private final Production17_246 production = new Production17_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}