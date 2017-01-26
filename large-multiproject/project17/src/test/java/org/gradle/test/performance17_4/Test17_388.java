package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_388 {
    private final Production17_388 production = new Production17_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}