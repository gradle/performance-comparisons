package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_362 {
    private final Production17_362 production = new Production17_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}