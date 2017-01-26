package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_267 {
    private final Production17_267 production = new Production17_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}