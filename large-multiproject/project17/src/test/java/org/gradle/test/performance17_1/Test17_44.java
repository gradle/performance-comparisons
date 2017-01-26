package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_44 {
    private final Production17_44 production = new Production17_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}