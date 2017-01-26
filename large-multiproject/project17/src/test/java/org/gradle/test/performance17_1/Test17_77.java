package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_77 {
    private final Production17_77 production = new Production17_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}