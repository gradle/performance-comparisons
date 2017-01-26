package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_498 {
    private final Production17_498 production = new Production17_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}