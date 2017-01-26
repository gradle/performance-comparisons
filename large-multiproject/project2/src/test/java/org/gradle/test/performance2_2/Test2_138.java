package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_138 {
    private final Production2_138 production = new Production2_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}