package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_80 {
    private final Production17_80 production = new Production17_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}