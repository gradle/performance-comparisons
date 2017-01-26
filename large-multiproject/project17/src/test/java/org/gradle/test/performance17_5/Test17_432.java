package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_432 {
    private final Production17_432 production = new Production17_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}