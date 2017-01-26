package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_305 {
    private final Production17_305 production = new Production17_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}