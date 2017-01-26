package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_266 {
    private final Production17_266 production = new Production17_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}