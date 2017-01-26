package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_196 {
    private final Production17_196 production = new Production17_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}