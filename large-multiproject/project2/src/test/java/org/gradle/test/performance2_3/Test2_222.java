package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_222 {
    private final Production2_222 production = new Production2_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}