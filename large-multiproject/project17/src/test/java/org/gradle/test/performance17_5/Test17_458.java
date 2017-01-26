package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_458 {
    private final Production17_458 production = new Production17_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}