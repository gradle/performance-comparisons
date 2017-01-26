package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_445 {
    private final Production17_445 production = new Production17_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}