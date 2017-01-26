package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_157 {
    private final Production17_157 production = new Production17_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}