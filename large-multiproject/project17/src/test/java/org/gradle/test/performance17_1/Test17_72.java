package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_72 {
    private final Production17_72 production = new Production17_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}