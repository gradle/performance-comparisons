package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_325 {
    private final Production17_325 production = new Production17_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}