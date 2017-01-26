package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_215 {
    private final Production17_215 production = new Production17_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}