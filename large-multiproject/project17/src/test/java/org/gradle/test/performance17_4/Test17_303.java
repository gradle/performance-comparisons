package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_303 {
    private final Production17_303 production = new Production17_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}