package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_14 {
    private final Production17_14 production = new Production17_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}