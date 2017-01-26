package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_88 {
    private final Production17_88 production = new Production17_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}