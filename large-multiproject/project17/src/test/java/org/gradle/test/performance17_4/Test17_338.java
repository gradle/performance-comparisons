package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_338 {
    private final Production17_338 production = new Production17_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}