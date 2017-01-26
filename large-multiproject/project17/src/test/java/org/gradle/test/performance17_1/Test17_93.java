package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_93 {
    private final Production17_93 production = new Production17_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}