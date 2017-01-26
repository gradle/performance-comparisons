package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_297 {
    private final Production17_297 production = new Production17_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}