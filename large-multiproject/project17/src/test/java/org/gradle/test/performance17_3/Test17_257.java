package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_257 {
    private final Production17_257 production = new Production17_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}