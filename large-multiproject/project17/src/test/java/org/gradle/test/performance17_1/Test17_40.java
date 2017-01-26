package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_40 {
    private final Production17_40 production = new Production17_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}