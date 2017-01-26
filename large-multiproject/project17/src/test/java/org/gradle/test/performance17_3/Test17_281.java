package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_281 {
    private final Production17_281 production = new Production17_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}