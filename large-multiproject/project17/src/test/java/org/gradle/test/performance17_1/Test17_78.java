package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_78 {
    private final Production17_78 production = new Production17_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}