package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_288 {
    private final Production17_288 production = new Production17_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}