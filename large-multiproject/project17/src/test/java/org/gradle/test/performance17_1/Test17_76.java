package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_76 {
    private final Production17_76 production = new Production17_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}