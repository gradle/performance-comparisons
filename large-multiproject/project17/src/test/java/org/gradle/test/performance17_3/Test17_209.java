package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_209 {
    private final Production17_209 production = new Production17_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}