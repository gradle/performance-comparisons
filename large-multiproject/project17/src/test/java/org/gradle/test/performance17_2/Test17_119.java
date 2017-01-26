package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_119 {
    private final Production17_119 production = new Production17_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}