package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_392 {
    private final Production17_392 production = new Production17_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}