package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_228 {
    private final Production17_228 production = new Production17_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}