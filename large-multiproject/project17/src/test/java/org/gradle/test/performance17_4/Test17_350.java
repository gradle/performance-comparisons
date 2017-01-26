package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_350 {
    private final Production17_350 production = new Production17_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}