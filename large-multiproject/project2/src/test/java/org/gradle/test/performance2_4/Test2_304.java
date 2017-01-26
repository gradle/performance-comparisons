package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_304 {
    private final Production2_304 production = new Production2_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}