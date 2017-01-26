package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_98 {
    private final Production17_98 production = new Production17_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}