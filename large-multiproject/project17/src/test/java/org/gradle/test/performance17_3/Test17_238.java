package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_238 {
    private final Production17_238 production = new Production17_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}