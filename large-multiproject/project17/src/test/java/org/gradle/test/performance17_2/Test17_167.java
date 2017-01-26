package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_167 {
    private final Production17_167 production = new Production17_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}