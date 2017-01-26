package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_331 {
    private final Production17_331 production = new Production17_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}