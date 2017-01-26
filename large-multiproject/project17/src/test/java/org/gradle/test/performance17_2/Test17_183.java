package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_183 {
    private final Production17_183 production = new Production17_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}