package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_419 {
    private final Production2_419 production = new Production2_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}