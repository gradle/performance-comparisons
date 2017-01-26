package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_135 {
    private final Production17_135 production = new Production17_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}