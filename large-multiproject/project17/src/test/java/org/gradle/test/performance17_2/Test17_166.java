package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_166 {
    private final Production17_166 production = new Production17_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}