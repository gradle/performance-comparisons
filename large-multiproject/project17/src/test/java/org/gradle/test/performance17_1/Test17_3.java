package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_3 {
    private final Production17_3 production = new Production17_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}