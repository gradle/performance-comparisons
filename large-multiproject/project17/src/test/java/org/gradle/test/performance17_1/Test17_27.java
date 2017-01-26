package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_27 {
    private final Production17_27 production = new Production17_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}