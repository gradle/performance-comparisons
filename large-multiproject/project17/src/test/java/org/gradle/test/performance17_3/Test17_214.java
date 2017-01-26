package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_214 {
    private final Production17_214 production = new Production17_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}