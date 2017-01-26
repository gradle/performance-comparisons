package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_209 {
    private final Production89_209 production = new Production89_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}