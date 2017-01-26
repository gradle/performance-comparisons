package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_168 {
    private final Production17_168 production = new Production17_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}