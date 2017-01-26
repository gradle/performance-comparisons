package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_427 {
    private final Production17_427 production = new Production17_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}