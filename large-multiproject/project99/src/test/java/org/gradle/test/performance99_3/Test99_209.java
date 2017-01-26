package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_209 {
    private final Production99_209 production = new Production99_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}