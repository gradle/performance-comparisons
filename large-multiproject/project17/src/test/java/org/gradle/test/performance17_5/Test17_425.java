package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_425 {
    private final Production17_425 production = new Production17_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}